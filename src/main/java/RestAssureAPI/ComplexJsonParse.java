package RestAssureAPI;

import APIUtility.PayLoad;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

public class ComplexJsonParse {
    //Concept of using find{} directly in the response to find something. It act as-

//    int hours = js.getInt(
//            "data.users[0].projects[0].tasks.find { it.taskId == 'T2' }.hours"
//    );

    // it means: current object of the array
    // tasks is an array
//Example -
//    "tasks": [
//    {
//        "taskId": "T1",
//            "status": "Completed",
//            "hours": 12
//    },
//    {
//        "taskId": "T2",
//            "status": "In Progress",
//            "hours": 8
//    }
//]
    public static void main(String[] args) {
        JsonPath js = new JsonPath(PayLoad.mockedJsonCoursePrice());

        //Print number of course returned by API
        int courseSize = js.getInt("courses.size()");
        System.out.println("Size of course array is: "+courseSize);

        //Print Purchase Amount
        int purchaseAmount = js.getInt("dashboard.purchaseAmount");
        System.out.println(purchaseAmount);

        //Print title of the first course
        String courseFirstTitle = js.getString("courses[0].title");
        System.out.println(courseFirstTitle);

        //Print title of the second course
        String courseSecondTitle = js.getString("courses[1].title");
        System.out.println(courseSecondTitle);

        //Iterate the course array and print the title and price
        for(int i=0; i<courseSize;i++){

            String courseTitle = js.get("courses["+i+"].title");
            System.out.println("Title of Course is: "+courseTitle);

            String coursePrice = js.get("courses["+i+"].price").toString();
            System.out.println("Price of Course is: "+coursePrice);
        }


        //Print number of copies sold by RPA course title
        for(int i=0; i<courseSize;i++) {

            String courseTitle = js.get("courses[" + i + "].title");

            if (courseTitle.equalsIgnoreCase("RPA")) {
                String copies = js.get("courses[" + i + "].copies").toString();
                System.out.println("Copies of Course is: " + copies);
                break;
            }


            // Calculate the total purchase amount of the course and match with the purchase amount displayed in the JSON
            int totalPurchaseAmount = 0;
            for (int j = 0; i < courseSize; i++) {
                int coursePrice = js.get("courses[" + i + "].price");
                int copies = js.get("courses[" + i + "].copies");

                totalPurchaseAmount = totalPurchaseAmount + coursePrice * copies;


            }
            System.out.println("Total Purchase Amount after calculation is: "+totalPurchaseAmount);
            Assert.assertEquals(purchaseAmount,totalPurchaseAmount);
        }
    }
}
