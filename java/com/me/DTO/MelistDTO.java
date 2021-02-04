package com.me.DTO;

public class MelistDTO {
	
		private int beginPage;
		private int finalPage;
		private int result;
		private boolean prev;
		private boolean next;
		private MbCriteria mcri;
		
		public MelistDTO(MbCriteria mcri, int result) {
			this.mcri=mcri;
			this.result=result; //전체 데이터 수
			
			this.finalPage=(int)(Math.ceil(mcri.getPageNo()/5.))*5;
			this.beginPage=this.finalPage-4;
			
			//currentEndPage 계산식
			int currentEndPage=(int)(Math.ceil((result*1.0)/mcri.getIndex()));
			if(currentEndPage<finalPage) {
				this.finalPage=currentEndPage;	
			}
			
			this.prev=this.beginPage > 1;
			this.next=this.finalPage < currentEndPage;
		}

		public int getBeginPage() {
			return beginPage;
		}

		public void setBeginPage(int beginPage) {
			this.beginPage = beginPage;
		}

		public int getFinalPage() {
			return finalPage;
		}

		public void setFinalPage(int finalPage) {
			this.finalPage = finalPage;
		}

		public int getResult() {
			return result;
		}

		public void setResult(int result) {
			this.result = result;
		}

		public boolean isPrev() {
			return prev;
		}

		public void setPrev(boolean prev) {
			this.prev = prev;
		}

		public boolean isNext() {
			return next;
		}

		public void setNext(boolean next) {
			this.next = next;
		}

		public MbCriteria getMcri() {
			return mcri;
		}

		public void setMcri(MbCriteria mcri) {
			this.mcri = mcri;
		}
		

}
