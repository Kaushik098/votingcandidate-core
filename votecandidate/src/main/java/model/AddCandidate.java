package model;

public class AddCandidate {

	private int candidateId;
	private String candidateName;
	private String candidatePosition;
	private int candidatePollCount;
	
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getCandidatePosition() {
		return candidatePosition;
	}
	public void setCandidatePosition(String candidatePosition) {
		this.candidatePosition = candidatePosition;
	}

	public int getCandidatePollCount() {
		return candidatePollCount;
	}
	public void setCandidatePollCount(int candidatePollCount) {
		this.candidatePollCount = candidatePollCount;
	}
	@Override
	public String toString() {
		return "AddCandidate [candidateId=" + candidateId + ", candidateName=" + candidateName + ", candidatePosition="
				+ candidatePosition + ", candidatePollCount=" + candidatePollCount + "]";
	}
	
	
}
