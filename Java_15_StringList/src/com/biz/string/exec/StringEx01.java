package com.biz.string.exec;

public class StringEx01 {

	public static void main(String[] args) {
		String[] nameLst=new String[] {
				"홍길동:001:33",
				"이몽룡:002:18",
				"성충향:003",
				"홍길동:001:33",
				"이몽룡:002:18"
		};
		
		int nCount=0;
		for(String s:nameLst) {
			try {
				String[] names=s.split(":");
				System.out.println(names[0]);
				System.out.println(names[1]);
				System.out.println(names[2]);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("exception 발생");
				System.out.printf("%d 번째 데이터\n",nCount);
			}
			nCount++;
		}
		
	}

}
