package controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice    //ȫ���쳣����
public class allExceptionRunner {
	@ExceptionHandler
	public void allException(Exception e){
		//�����쳣���ͣ�ת�Ƶ���ͬ����ҳ
		if(e instanceof NullPointerException) {
			
		}
//		return view;
	}
}
