package com.company.mypage.web.domain.sample;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.company.mypage.web.domain.sample.message.SampleRequest;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api")
public class SampleController {
	
	//private final SampleService sampleService;

    /**
     * 테스트
     * @return 책 리스트
     * 
     */
    @GetMapping("/test")
    public Map<String, String> getSampleData () {
    	
    	Map<String, String> rtn  = new HashMap<>();
    	
    	rtn.put("1", "Hi! Spring!!");
		return rtn;
    }
    
    /*
    @GetMapping("/{id}")
    public String getSampleData(@PathVariable(value = "id") Long id) {
      //return bookService.findBookById(id);
    	return "getSampleData";
    }

    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createBook(@RequestBody SampleRequest sampleRequest) {
    	return "";
    }
    */
    
}
