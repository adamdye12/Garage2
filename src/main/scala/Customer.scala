/**
  * Created by Administrator on 15/06/2017.
  */
class Customer (val firstName: String,
                 var surName: String,
                 val dateOfBirth: String,
                 var addressLine1: String,
                 var addressLine2: String,
                 var addressLine3: String,
                 var postCode: String,
                 var email: String,
                 var phoneNumber: String,
                 val customerId: Int
                ) extends Person() {
    override def toString: String = {
      s"Name: $firstName $surName. Date of birth is $dateOfBirth. Address: $addressLine1 $addressLine2 $addressLine3. Post Code: $postCode. Email Address: $email Phone Number is $phoneNumber. Customer ID:$customerId."
    }
  }

