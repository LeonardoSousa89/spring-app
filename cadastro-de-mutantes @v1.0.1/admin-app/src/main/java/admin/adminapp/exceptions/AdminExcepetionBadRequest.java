package admin.adminapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AdminExcepetionBadRequest extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public AdminExcepetionBadRequest(String msg) {
		super(msg);
	}
	
}
