package com.example.demo.Entity;
import javax.validation.constraints.NotEmpty;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name="FIRTable")
public class FIR {
	 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

   
     private Long id;

    @NotEmpty
    private String district;

    @NotEmpty
    private String policeStation;

    @NotEmpty
    private String act;

   
    private Long firNumber;

    private LocalDateTime dateTimeOfFIR;

    private String generalDiaryReferenceNumber;

    @NotEmpty
    
    private String typeOfInformation;

    @NotEmpty
    private String placeOfOccurrence;

    @NotEmpty
    private String complainantFullName;

    private LocalDateTime complainantDOB;

    private String complainantNationality;

    private String complainantAadhaarNumber;

    private String complainantOccupation;

    @Size(min = 10, max = 10)
    private String complainantMobileNumber;

    @NotEmpty
    private String complainantAddress;

    private String suspectName;

    private String suspectAddress;

    private String enquiryOfficerName;

    @NotEmpty
    private String enquiryOfficerRank;

	public FIR(Long id, @NotEmpty String district, @NotEmpty String policeStation, @NotEmpty String act, Long firNumber,
			LocalDateTime dateTimeOfFIR, String generalDiaryReferenceNumber, @NotEmpty String typeOfInformation,
			@NotEmpty String placeOfOccurrence, @NotEmpty String complainantFullName, LocalDateTime complainantDOB,
			String complainantNationality, String complainantAadhaarNumber, String complainantOccupation,
			@Size(min = 10, max = 10) String complainantMobileNumber, @NotEmpty String complainantAddress,
			String suspectName, String suspectAddress, String enquiryOfficerName, @NotEmpty String enquiryOfficerRank) {
		super();
		this.id = id;
		this.district = district;
		this.policeStation = policeStation;
		this.act = act;
		this.firNumber = firNumber;
		this.dateTimeOfFIR = dateTimeOfFIR;
		this.generalDiaryReferenceNumber = generalDiaryReferenceNumber;
		this.typeOfInformation = typeOfInformation;
		this.placeOfOccurrence = placeOfOccurrence;
		this.complainantFullName = complainantFullName;
		this.complainantDOB = complainantDOB;
		this.complainantNationality = complainantNationality;
		this.complainantAadhaarNumber = complainantAadhaarNumber;
		this.complainantOccupation = complainantOccupation;
		this.complainantMobileNumber = complainantMobileNumber;
		this.complainantAddress = complainantAddress;
		this.suspectName = suspectName;
		this.suspectAddress = suspectAddress;
		this.enquiryOfficerName = enquiryOfficerName;
		this.enquiryOfficerRank = enquiryOfficerRank;
	}

	public FIR() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPoliceStation() {
		return policeStation;
	}

	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}

	public String getAct() {
		return act;
	}

	public void setAct(String act) {
		this.act = act;
	}

	public Long getFirNumber() {
		return firNumber;
	}

	public void setFirNumber(Long firNumber) {
		this.firNumber = firNumber;
	}

	public LocalDateTime getDateTimeOfFIR() {
		return dateTimeOfFIR;
	}

	public void setDateTimeOfFIR(LocalDateTime dateTimeOfFIR) {
		this.dateTimeOfFIR = dateTimeOfFIR;
	}

	public String getGeneralDiaryReferenceNumber() {
		return generalDiaryReferenceNumber;
	}

	public void setGeneralDiaryReferenceNumber(String generalDiaryReferenceNumber) {
		this.generalDiaryReferenceNumber = generalDiaryReferenceNumber;
	}

	public String getTypeOfInformation() {
		return typeOfInformation;
	}

	public void setTypeOfInformation(String typeOfInformation) {
		this.typeOfInformation = typeOfInformation;
	}

	public String getPlaceOfOccurrence() {
		return placeOfOccurrence;
	}

	public void setPlaceOfOccurrence(String placeOfOccurrence) {
		this.placeOfOccurrence = placeOfOccurrence;
	}

	public String getComplainantFullName() {
		return complainantFullName;
	}

	public void setComplainantFullName(String complainantFullName) {
		this.complainantFullName = complainantFullName;
	}

	public LocalDateTime getComplainantDOB() {
		return complainantDOB;
	}

	public void setComplainantDOB(LocalDateTime complainantDOB) {
		this.complainantDOB = complainantDOB;
	}

	public String getComplainantNationality() {
		return complainantNationality;
	}

	public void setComplainantNationality(String complainantNationality) {
		this.complainantNationality = complainantNationality;
	}

	public String getComplainantAadhaarNumber() {
		return complainantAadhaarNumber;
	}

	public void setComplainantAadhaarNumber(String complainantAadhaarNumber) {
		this.complainantAadhaarNumber = complainantAadhaarNumber;
	}

	public String getComplainantOccupation() {
		return complainantOccupation;
	}

	public void setComplainantOccupation(String complainantOccupation) {
		this.complainantOccupation = complainantOccupation;
	}

	public String getComplainantMobileNumber() {
		return complainantMobileNumber;
	}

	public void setComplainantMobileNumber(String complainantMobileNumber) {
		this.complainantMobileNumber = complainantMobileNumber;
	}

	public String getComplainantAddress() {
		return complainantAddress;
	}

	public void setComplainantAddress(String complainantAddress) {
		this.complainantAddress = complainantAddress;
	}

	public String getSuspectName() {
		return suspectName;
	}

	public void setSuspectName(String suspectName) {
		this.suspectName = suspectName;
	}

	public String getSuspectAddress() {
		return suspectAddress;
	}

	public void setSuspectAddress(String suspectAddress) {
		this.suspectAddress = suspectAddress;
	}

	public String getEnquiryOfficerName() {
		return enquiryOfficerName;
	}

	public void setEnquiryOfficerName(String enquiryOfficerName) {
		this.enquiryOfficerName = enquiryOfficerName;
	}

	public String getEnquiryOfficerRank() {
		return enquiryOfficerRank;
	}

	public void setEnquiryOfficerRank(String enquiryOfficerRank) {
		this.enquiryOfficerRank = enquiryOfficerRank;
	}

	@Override
	public String toString() {
		return "FIR [id=" + id + ", district=" + district + ", policeStation=" + policeStation + ", act=" + act
				+ ", firNumber=" + firNumber + ", dateTimeOfFIR=" + dateTimeOfFIR + ", generalDiaryReferenceNumber="
				+ generalDiaryReferenceNumber + ", typeOfInformation=" + typeOfInformation + ", placeOfOccurrence="
				+ placeOfOccurrence + ", complainantFullName=" + complainantFullName + ", complainantDOB="
				+ complainantDOB + ", complainantNationality=" + complainantNationality + ", complainantAadhaarNumber="
				+ complainantAadhaarNumber + ", complainantOccupation=" + complainantOccupation
				+ ", complainantMobileNumber=" + complainantMobileNumber + ", complainantAddress=" + complainantAddress
				+ ", suspectName=" + suspectName + ", suspectAddress=" + suspectAddress + ", enquiryOfficerName="
				+ enquiryOfficerName + ", enquiryOfficerRank=" + enquiryOfficerRank + "]";
	}

    
}
