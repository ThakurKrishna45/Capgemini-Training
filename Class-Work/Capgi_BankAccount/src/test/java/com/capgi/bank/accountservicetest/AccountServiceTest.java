package com.capgi.bank.accountservicetest;

import com.capgi.bank.config.CustomMapper;
import com.capgi.bank.entity.Account;
import com.capgi.bank.entity.dto.AccountDto;
import com.capgi.bank.entity.dto.AccountResponseDto;
import com.capgi.bank.repository.AccountRepository;
import com.capgi.bank.service.impl.AccountServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {

    @Mock
    private AccountRepository accountRepository;
    @Mock
    private ModelMapper modelMapper;
    @InjectMocks
    private AccountServiceImpl accountService;
    @Test
    void testCreateAccount(){
        AccountDto accountDto = new AccountDto();
        accountDto.setAccountHolderName("Krishna");
        Account account = new Account();
        try(MockedStatic<CustomMapper> mockedMapper=
                    Mockito.mockStatic(CustomMapper.class)){
            mockedMapper.when(()->CustomMapper.mapAccountDtoToAccount(accountDto, new Account()))
                    .thenReturn(account);
            accountService.createAccount(accountDto);
            verify(accountRepository,times(1)).save(any(Account.class));
        }

    }
    @Test
    void testGetAccountById(){
        Integer accountId=1;
        Account account=new Account();
        account.setAccountId(accountId);
        account.setAccountHolderName("John");
        AccountResponseDto responseDto=new AccountResponseDto();
        responseDto.setAccountId(accountId);
        responseDto.setAccountHolderName("John");
        when(accountRepository.findById(accountId)).thenReturn(Optional.of(account));
        when(modelMapper.map(account,AccountResponseDto.class)).thenReturn(responseDto);
        AccountResponseDto result=accountService.findById(accountId);
        assertNotNull(result);
        assertEquals(accountId,result.getAccountId());
        assertEquals("John",result.getAccountHolderName());
        verify(accountRepository).findById(accountId);
        verify(modelMapper).map(account,AccountResponseDto.class);
    }
}
