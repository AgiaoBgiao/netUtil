package service;

import model.AModel;

public class AService {
	//������ڻ��I��
	public int init(AModel aModel){
		aModel.setName("zhangsan");
		aModel.setSex("man");
		aModel.setMajor("english");
		return 1;
	}
}
