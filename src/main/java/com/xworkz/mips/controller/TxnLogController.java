package com.xworkz.mips.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.mips.dao.TransactionDAO;
import com.xworkz.mips.dto.TxnRequestDTO;


@RestController
@RequestMapping(value = "/")
public class TxnLogController {

	Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

	@Autowired
	private TransactionDAO transactionDAO;

	public TxnLogController() {
		logger.info("Created :::::::: " + this.getClass().getSimpleName());
	}

	@PostMapping(value = "/getLogs")
	public ResponseEntity<String> getTxnLogs(@RequestBody TxnRequestDTO txnRequestDTO,
			@RequestParam(value = "fromDate", required=false) String fromDate, 
			@RequestParam(value = "toDate", required=false) String toDate) {
		logger.info("Inside get transaction logs " + txnRequestDTO.toString());
		try {
			String transactionDTOs = transactionDAO.getTransaction(txnRequestDTO, fromDate, toDate);
			if (transactionDTOs != null) {
				return new ResponseEntity<>(transactionDTOs, HttpStatus.ACCEPTED);
			} else {
				return new ResponseEntity<>("No data found", HttpStatus.ACCEPTED);
			}
		} catch (Exception e) {
			logger.info("Exception while getting transaction info " + e.getStackTrace());
		}
		return null;
	}
}
