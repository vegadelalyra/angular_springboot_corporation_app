package com.vegadelalyra.angular.spring.cafe.system.rest;

import com.vegadelalyra.angular.spring.cafe.system.POJO.Bill;
import org.eclipse.angus.mail.imap.protocol.INTERNALDATE;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping(path = "/bill")
public interface BillRest {
    @PostMapping(path = "/generateReport")
    ResponseEntity<String> generateReport(@RequestBody Map<String, Object> requestMap);

    @GetMapping(path = "")
    ResponseEntity<List<Bill>> getBills();

    @PostMapping(path = "/getPdf")
    ResponseEntity<byte[]> getPdf(@RequestBody Map<String, Object> requestMap);

    @DeleteMapping(path = "/{id}")
    ResponseEntity<String> deleteBill(@PathVariable Integer id);
}
