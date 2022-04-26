package com.te.methods;

public class Col {
	
	String name;
	String area;
	String subject;
    int students;
    int teachers;
    
    public Col(String name,String area) {
    	this.name=name;
    	this.area=area;
    }
    public Col(String name,String area,String subject) {
    	this.name=name;
    	this.area=area;
    	this.subject=subject;
    	
    }
    public Col(String name,String area,String subject,int students) {
    	this.name=name;
    	this.area=area;
    	this.subject=subject;
    	this.students=students;
    	
    	
    }
    public Col(String name,String area,String subject,int students,int teachers) {
    	this.name=name;
    	this.area=area;
    	this.students=students;
    	this.subject=subject;
    	this.teachers=teachers;
    }

	public static void main(String[] args) {
		
		Col co=new Col("loki","ameerpet");
		Col co1=new Col("swamy","yarragadda","Biology");
		Col co2=new Col("ravi","punjagutta","Geography",100);
		Col co3=new Col("vijay","banjarahills","java",100,2);	
		
		System.out.println(co.name+" "+co.area);
		System.out.println(co1.name+" "+co1.area+" "+co1.subject);
		System.out.println(co2.name+" "+co2.area+" "+co2.subject+" "+co2.students);
		System.out.println(co3.name+" "+co3.area+" "+co3.subject+" "+co3.students+co3.teachers);

	}
	

}
