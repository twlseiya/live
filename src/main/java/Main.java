import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
//            jsonYN();
//            jsonKJ();
//            jsonJS();
//            jsonQC();
//            jsonCL();
//            jsonYL();
            jsonU8();
//            jsonFY();
//            jsonAL();
//            jsonAMR();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void jsonAMR() throws IOException, JSONException {
        File f = new File(Main.class.getResource("/").getPath());
        System.out.println(f);
        BufferedReader br = new BufferedReader(new FileReader(f + "\\json\\aimeiren.json"));
        String line = "";
        StringBuffer buffer = new StringBuffer();
        while ((line = br.readLine()) != null) {
            buffer.append(line);
        }

        String jsonString = "";
        jsonString = buffer.toString();
        JSONObject jsonObj = new JSONObject(jsonString);
//        JSONArray dataArray = new JSONArray(jsonObj.getJSONObject("data").get("list").toString());
        JSONArray dataArray = new JSONArray(jsonObj.get("Data").toString());
        int dataSize = dataArray.length();
        if (dataSize > 0) {

            for (int i = 0; i < dataSize; i++) {
                JSONObject jo = dataArray.getJSONObject(i);
                try {
                    String a = jo.get("UserID").toString();
//                    a = a.replace("rtmp:", "http:");
                    if (!"".equals(a)) {
                        System.out.print("http://10683.liveplay.myqcloud.com/live/10683_");
                        System.out.println(a + ".flv");
                    }
                } catch (JSONException e) {

                }


            }
        }
    }
    private static void jsonJS() throws IOException, JSONException {
        File f = new File(Main.class.getResource("/").getPath());
        System.out.println(f);
        BufferedReader br = new BufferedReader(new FileReader(f + "\\json\\jinsha.json"));
        String line = "";
        StringBuffer buffer = new StringBuffer();
        while ((line = br.readLine()) != null) {
            buffer.append(line);
        }

        String jsonString = "";
        jsonString = buffer.toString();
        JSONObject jsonObj = new JSONObject(jsonString);
        JSONArray dataArray = new JSONArray(jsonObj.getJSONObject("data").getJSONArray("info").getJSONObject(0).get("list").toString());

        int dataSize = dataArray.length();
        if (dataSize > 0) {

            for (int i = 0; i < dataSize; i++) {
                JSONObject jo = dataArray.getJSONObject(i);
                try {
                    String a = jo.get("pull").toString();
                    a = a.replace("rtmp:", "http:");
                    if (!"".equals(a)) {
                        System.out.println(a + ".flv");
                    }
                } catch (JSONException e) {

                }


            }
        }
    }
    private static void jsonFY() throws IOException, JSONException {
        File f = new File(Main.class.getResource("/").getPath());
        System.out.println(f);
        BufferedReader br = new BufferedReader(new FileReader(f + "\\json\\feiyu.json"));
        String line = "";
        StringBuffer buffer = new StringBuffer();
        while ((line = br.readLine()) != null) {
            buffer.append(line);
        }

        String jsonString = "";
        jsonString = buffer.toString();
        JSONObject jsonObj = new JSONObject(jsonString);
//        JSONArray dataArray = new JSONArray(jsonObj.getJSONObject("data").get("list").toString());
        JSONArray dataArray = new JSONArray(jsonObj.get("data").toString());
        int dataSize = dataArray.length();
        if (dataSize > 0) {

            for (int i = 0; i < dataSize; i++) {
                JSONObject jo = dataArray.getJSONObject(i);
                try {
                    String a = jo.get("curroomnum").toString();
//                    a = a.replace("rtmp:", "http:");
                    if (!"".equals(a)) {
                        System.out.print("https://pull.szdmcoffee.com/vod/");
                        System.out.println(a + ".flv");
                    }
                } catch (JSONException e) {

                }


            }
        }
    }

    private static void jsonCL() throws IOException, JSONException {
        File f = new File(Main.class.getResource("/").getPath());
        System.out.println(f);
        BufferedReader br = new BufferedReader(new FileReader(f + "\\json\\chailang.json"));
        String line = "";
        StringBuffer buffer = new StringBuffer();
        while ((line = br.readLine()) != null) {
            buffer.append(line);
        }

        String jsonString = "";
        jsonString = buffer.toString();
        JSONObject jsonObj = new JSONObject(jsonString);
        JSONArray dataArray = new JSONArray(jsonObj.get("info").toString());
        int dataSize = dataArray.length();
        if (dataSize > 0) {

            for (int i = 0; i < dataSize; i++) {
                JSONObject jo = dataArray.getJSONObject(i);
                try {
                    String a = jo.get("channel_source").toString();
                    a = a.replace("rtmp:", "http:");
                    if (!"".equals(a)) {
                        System.out.println(a + ".flv");
                    }
                } catch (JSONException e) {

                }


            }
        }
    }
    private static void jsonYN() throws IOException, JSONException {
        File f = new File(Main.class.getResource("/").getPath());
        System.out.println(f);
        BufferedReader br = new BufferedReader(new FileReader(f + "\\json\\youniao.json"));
        String line = "";
        StringBuffer buffer = new StringBuffer();
        while ((line = br.readLine()) != null) {
            buffer.append(line);
        }

        String jsonString = "";
        jsonString = buffer.toString();
        JSONObject jsonObj = new JSONObject(jsonString);
        JSONArray dataArray = new JSONArray(jsonObj.get("info").toString());
        int dataSize = dataArray.length();
        if (dataSize > 0) {

            for (int i = 0; i < dataSize; i++) {
                JSONObject jo = dataArray.getJSONObject(i);
                try {
                    String a = jo.get("channel_source").toString();
                    a = a.replace("rtmp:", "http:");
                    if (!"".equals(a)) {
                        System.out.println(a + ".flv");
                    }
                } catch (JSONException e) {

                }


            }
        }
    }
    private static void jsonKJ() throws IOException, JSONException {
        File f = new File(Main.class.getResource("/").getPath());
        System.out.println(f);
        BufferedReader br = new BufferedReader(new FileReader(f + "\\json\\kongjie.json"));
        String line = "";
        StringBuffer buffer = new StringBuffer();
        while ((line = br.readLine()) != null) {
            buffer.append(line);
        }

        String jsonString = "";
        jsonString = buffer.toString();
        JSONObject jsonObj = new JSONObject(jsonString);
        JSONArray dataArray = new JSONArray(jsonObj.get("info").toString());
        int dataSize = dataArray.length();
        if (dataSize > 0) {

            for (int i = 0; i < dataSize; i++) {
                JSONObject jo = dataArray.getJSONObject(i);
                try {
                    String a = jo.get("channel_source").toString();
                    a = a.replace("rtmp:", "http:");
                    if (!"".equals(a)) {
                        System.out.println(a + ".flv");
                    }
                } catch (JSONException e) {

                }


            }
        }
    }

    private static void jsonU8() throws IOException, JSONException {
        File f = new File(Main.class.getResource("/").getPath());
        System.out.println(f);
        BufferedReader br = new BufferedReader(new FileReader(f + "\\json\\u8.json"));
        String line = "";
        StringBuffer buffer = new StringBuffer();
        while ((line = br.readLine()) != null) {
            buffer.append(line);
        }

        String jsonString = "";
        jsonString = buffer.toString();
        JSONObject jsonObj = new JSONObject(jsonString);
        JSONArray dataArray = new JSONArray(jsonObj.get("live_list").toString());
        int dataSize = dataArray.length();
        if (dataSize > 0) {

            for (int i = 0; i < dataSize; i++) {
                JSONObject jo = dataArray.getJSONObject(i);
                try {
                    String a = jo.get("replay_url").toString();
                    String b = jo.get("live_flv_url").toString();
//                    a = a.replace("rtmp:", "http:");
                    if (!"".equals(a)) {
                        System.out.println(a);
                    }
//                    if (!"".equals(b)) {
//                        System.out.println(b);
//                    }
                } catch (JSONException e) {

                }


            }
        }
    }
    private static void jsonYL() throws IOException, JSONException {
        File f = new File(Main.class.getResource("/").getPath());
        System.out.println(f);
        BufferedReader br=new BufferedReader(new FileReader(f+"\\json\\yelang.json"));
        String line="";
        StringBuffer buffer = new StringBuffer();
        while((line=br.readLine())!=null){
            buffer.append(line);
        }

        String jsonString = "";
        jsonString = buffer.toString();
        JSONObject jsonObj = new JSONObject(jsonString);
        JSONArray dataArray = new JSONArray(jsonObj.getJSONObject("data").get("list").toString());
        int dataSize = dataArray.length();
        if (dataSize > 0) {

            for (int i = 0; i < dataSize; i++) {
                JSONObject jo = dataArray.getJSONObject(i);
                try {
//                    http://pili-live-rtmp.paoyang.top/ylyp/YLZHIBO1976823940.flv
//                    http://pili-live-rtmp.paoyang.top/ylyp/YLZHIBO1972630866.flv
//                    http://pili-live-rtmp.paoyang.top/ylyp/YLZHIBO1030342868.flv
//                    http://pili-live-rtmp.paoyang.top/ylyp/YLZHIBO1765509009.flv



//                    http://pili-live-rtmp.paoyang.top/ylyp/YLZHIBO1095581408.flv

                    System.out.print("http://pili-live-rtmp.paoyang.top/ylyp/YLZHIBO");
                    System.out.print(jo.get("curroomnum").toString());
                    System.out.println(".flv");
                } catch (JSONException e) {

                }


            }
        }
    }


    private static void jsonQC() throws IOException, JSONException {
        File f = new File(Main.class.getResource("/").getPath());
        System.out.println(f);
        BufferedReader br=new BufferedReader(new FileReader(f+"\\json\\qiancao.json"));
        String line="";
        StringBuffer buffer = new StringBuffer();
        while((line=br.readLine())!=null){
            buffer.append(line);
        }

        String jsonString = "";
        jsonString = buffer.toString();
        JSONObject jsonObj = new JSONObject(jsonString);
        JSONArray dataArray = new JSONArray(jsonObj.getJSONObject("data").get("list").toString());
        int dataSize = dataArray.length();
        if (dataSize > 0) {

            for (int i = 0; i < dataSize; i++) {
                JSONObject jo = dataArray.getJSONObject(i);
                try {
                    System.out.print("http://pili-live-rtmp.eadiannet.com/qianc/qc");
                    System.out.print(jo.get("curroomnum").toString());
                    System.out.println(".flv");
                } catch (JSONException e) {

                }


            }
        }
    }


    private static void jsonAL() throws IOException, JSONException {
        File f = new File(Main.class.getResource("/").getPath());
        System.out.println(f);
        BufferedReader br = new BufferedReader(new FileReader(f + "\\json\\ali.json"));
        String line = "";
        StringBuffer buffer = new StringBuffer();
        while ((line = br.readLine()) != null) {
            buffer.append(line);
        }

        String jsonString = "";
        jsonString = buffer.toString();
        JSONObject jsonObj = new JSONObject(jsonString);
        JSONArray dataArray = new JSONArray(jsonObj.getJSONObject("data").get("info").toString());
        int dataSize = dataArray.length();
        if (dataSize > 0) {

            for (int i = 0; i < dataSize; i++) {
                JSONObject jo = dataArray.getJSONObject(i);
                try {
                    String a = jo.get("pull").toString();
                    a = a.replace("rtmp:", "http:");
                    if (!"".equals(a)) {
                        System.out.println(a + ".flv");
                    }
                } catch (JSONException e) {

                }


            }
        }
    }
}
