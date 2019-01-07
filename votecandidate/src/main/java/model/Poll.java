package model;

public class Poll {

	private int CandidateId;
	private String CandidateName;
	private int CandidatePollCount;
    private String CandidatePosition;
    
	@Override
	public String toString() {
		return "Poll [CandidateId=" + CandidateId + ", CandidateName=" + CandidateName + ", CandidatePollCount="
				+ CandidatePollCount + ", CandidatePosition=" + CandidatePosition + "]";
	}
    
    
	
//	CandidateId, CandidateName, CandidatePollCount, CandidatePosition
}
