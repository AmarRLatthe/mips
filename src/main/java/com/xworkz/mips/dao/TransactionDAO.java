package com.xworkz.mips.dao;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xworkz.mips.dto.TxnRequestDTO;

@Repository
public class TransactionDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    private Environment env;

    Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    public String getTransaction(TxnRequestDTO dto, String fromDate, String toDate) throws JsonProcessingException {
        logger.info("Inside get transaction ::::::::::: ");
        String jsonOut = null;
        String query = env.getProperty("txn.log.query");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        query = query + dto.getStateCode().toLowerCase() + "_transaction_logs ";
        boolean isOrderByAdded = false;
        try {

            if (dto.getUserRole() != null && dto.getUserRole().equals("state_admin")) {
                logger.info("Inside if get transaction ::::::::::: ");
                query = query + " order by finished_time desc";
                isOrderByAdded = true;
            } else if (dto.getUserRole() != null && dto.getUserRole().equals("facility_admin")) {
                query = query + " where facility_id=" + "'" + dto.getFacilityId() + "'";
            } else if (dto.getUserRole() != null && dto.getUserRole().equals("facility_provider")) {
                if (dto.getProviderDEA() != null && !dto.getProviderDEA().equals("")) {
                    query = query + " where provider_dea=" + "'" + dto.getProviderDEA() + "'";
                } else if (dto.getProviderNPI() != null && !dto.getProviderNPI().equals("")) {
                    query = query + " where provider_npi= " + "'" + dto.getProviderNPI() + "'";
                } else if (dto.getProviderStateLicNo() != null && !dto.getProviderStateLicNo().equals("")) {
                    query = query + " where state_license_code= " + "'" + dto.getProviderStateLicNo() + "'";
                } else if (dto.getProviderStateLicNo() != null && !dto.getProviderStateLicNo().equals("")) {
                    query = query + " where ehr_username = " + "'" + dto.getEhrUserName() + "'";
                } else if((fromDate != null && !fromDate.equals("")) &&
                		(toDate != null && !fromDate.equals(""))) {
                	query = query + " and created_time between '" + fromDate + "' and '" + toDate + "'";
                }
            }
            
            if (!isOrderByAdded) {
                query = query + " order by finished_time desc";
            }
            logger.info("Executing query ::::::::::: " + query);
            List<Map<String, Object>> result = jdbcTemplate.queryForList(query.toString());
            ObjectMapper mapper = new ObjectMapper();
            mapper.setDateFormat(dateFormat);
            jsonOut = mapper.writeValueAsString(result);

        } catch (Exception e) {
            logger.info("Exception while executing query ::::::::::: " + e.getStackTrace());
        }
        return jsonOut;
    }
}
