package ibmtal.trendyol.business.services;

import java.util.ArrayList;

import com.sun.net.httpserver.Authenticator.Result;

import ibmtal.trendyol.dto.MyAccountDto;
import ibmtal.trendyol.entity.MyAccount;





public interface MyAccountService {
	ArrayList<MyAccount> getAll();
	Result addMyAccount(MyAccount myaccount);
	Result addMyAccountDto(MyAccountDto myaccountDto);
	Result addCompany(MyAccount myaccount);
	Result getCompany(Integer id);
	Result getMyAccount(Integer id);
}
