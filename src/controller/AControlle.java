package controller;

import common.MsgBean;
import model.AModel;
import service.AService;

public class AController {
	
	AService aService = new AService();
	
	public String index(AModel aModel){
		//���`�ӥ�����ӳ�����������ڻ��O��
		aService.init(aModel);
		//logӛ�h
		System.out.println(MsgBean.AMsg);
		//�����w��
		return "a.html";
	}
	

}
