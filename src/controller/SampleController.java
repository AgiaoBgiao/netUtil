package controller;

import common.MsgBean;
import model.SampleModel;
import service.SampleService;

public class SampleController {
	
	SampleService sampleService = new SampleService();
	
	public String index(SampleModel sampleModel){
		//���`�ӥ�����ӳ�����������ڻ��O��
		sampleService.init(sampleModel);
		//logӛ�h
		System.out.println(MsgBean.sampleMsg);
		//�����w��
		return "sample.html";
	}
	

}
