package com.capgi.bank.accountcontrollertest;

import com.capgi.bank.controller.AccountController;
import com.capgi.bank.entity.dto.AccountDto;
import com.capgi.bank.entity.dto.AccountType;
import com.capgi.bank.service.AccountService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AccountController.class)
public class AccountControllerTest {
    @Autowired
    private MockMvc mockMvc; // fake http client
    @MockitoBean
    private AccountService accountService;
    @Autowired
    private ObjectMapper objectMapper;
    @Test
    void testCreateAccount() throws Exception{
        AccountDto accountDto=new AccountDto();
        accountDto.setAccountType(AccountType.SAVING);
        accountDto.setBalance(100000L);
        accountDto.setAccountHolderName("Krishna");
        accountDto.setHolderEmail("test1@gmail.com");
        accountDto.setAccountSecureKey("fwsersafre");
        Mockito.doNothing().when(accountService).createAccount(Mockito.any(AccountDto.class));

        mockMvc.perform(
                post("/account/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(accountDto))
        ).andExpect(status().isCreated());
    }
}
