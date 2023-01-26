package CheckApiResopnse;


import org.apache.http.HttpEntity;

import org.json.JSONObject;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import org.apache.http.util.EntityUtils;

import java.io.IOException;


public class Myhttpclient {
   public final CloseableHttpClient httpClient = HttpClients.createDefault();

   public static void main(String[] args) throws Exception {

      Myhttpclient obj = new Myhttpclient();

      try {
         System.out.println("Testing 1 - Send Http GET request");
         String token="EAADQLJxeGEMBADCqQMXQrWutmgzgqtH7ZB3DVtTZC3VPsDxVK5ZAEsqDuIQfzcPEGodaWhLdv0TfZA0U56BOpx81ktWfXdKOe3eRPyDNNYZBvSq1GcGFZARZBQsnekR0gPsblLEKlZC49yNxm5MfxlZBHTwfn4qdIbvwLHDjee4G1wQZDZD";
         // obj.sendGet(token);
         System.out.println();

      } finally {
         obj.close();
      }
   }

   public void close() throws IOException {
      httpClient.close();
   }

   public void sendGet(String url) throws Exception {


      //https://graph.facebook.com/v6.0/me?name,id_token=
      // https://graph.facebook.com/me?fields=id,name&access_token=EAAB9X49QJacBAFDNl4uIXuWFlvtTWEHXhFqySzPsdXbZCYHGKtZBkFgc7EyjZCfP2RcCzCZBaiJTldm05ZCgow6KvEIyyhTuao8A4AK97tzT2OkLHiXRna0mq7QChGEAg0vRkADDmXlaq97ioaly30EKnD7nEGb3NsYAQx4jYCzMR0KhYFiQ9J8z5tagx7moxZBywb8xTFBXbZBvdXZAebFH6CocSzJr0Q6uvUXHNx0S5gZDZD
      // https://graph.facebook.com/v6.0/1557782724478208/feed?since=2022-06-22&fields=target,id,from,message,created_time&limit=100&access_token="+token
      HttpGet request = new HttpGet(url);
      try (CloseableHttpResponse response = httpClient.execute(request)) {
         HttpEntity entity = response.getEntity();
         if (entity != null) {

            String result = EntityUtils.toString(entity);

            JSONObject json = new JSONObject(result);

            try {
               String message=json.getJSONObject("error").get("message").toString();






            }catch (Exception e){


               System.out.print(e);

            }




         }

      }
   }



}
