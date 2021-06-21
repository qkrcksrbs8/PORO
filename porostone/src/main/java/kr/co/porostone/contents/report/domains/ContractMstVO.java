package kr.co.porostone.contents.report.domains;

public class ContractMstVO {

	private int contract_seq		= 0;			

	public int getContract_seq() {
		return contract_seq;
	}
	public void setContract_seq(int contract_seq) {
		this.contract_seq = contract_seq;
	}
	
	@Override
	public String toString() {
		return "ContractMstVO [contract_seq=" + contract_seq + "]";
	}
	
}
