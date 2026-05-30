package VymoAPITesting;

public class Payload {

    public static String getPolicyPayload(String policyName, String policyNumber){
        String policyPayload = "{\n" +
                "  \"module\": \"policy\",\n" +
                "  \"user_vymo_id\": \"NJMDR01\",\n" +
                "  \"fields\": [\n" +
                "    {\n" +
                "      \"code\": \"name\",\n" +
                "      \"value\": \""+policyName+"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"code\": \"primary_phone_number\",\n" +
                "      \"value\": \"8934567890\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"code\": \"primary_email\",\n" +
                "      \"value\": \"dental@gmail.com\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"code\": \"policy_number\",\n" +
                "      \"value\": \""+policyNumber+"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"code\": \"policy_status\",\n" +
                "      \"value\": \"Active\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        return policyPayload;
    }
}
