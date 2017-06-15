/**
  * Created by Administrator on 15/06/2017.
  */
  class Employee(val firstName: String,
                 var surName: String,
                 val dateOfBirth: String,
                 var addressLine1: String,
                 var addressLine2: String,
                 var addressLine3: String,
                 var postCode: String,
                 var email: String,
                 var phoneNumber: String,
                 val employeeId: Int,
                 var jobTitle: String
                ) extends Person() {
    override def toString: String = {
      s"Name: $firstName $surName. Date of Birth: $dateOfBirth. Address: $addressLine1 $addressLine2 $addressLine3. Post Code: $postCode. Email: $email Phone Number: $phoneNumber. Employee ID: $employeeId. Job Title: $jobTitle"
    }
  }
