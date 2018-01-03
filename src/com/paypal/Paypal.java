package com.paypal;

        import java.io.File;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.net.HttpURLConnection;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.concurrent.Callable;
        import java.util.concurrent.ExecutorService;
        import java.util.concurrent.*;

public class Paypal {

    /*public static String filePath = "";
    public static String serviceURL = "";
    private ExecutorService service ;

    public Paypal() {
        this.service = Executors.newFixedThreadPool(5);
    }

    *//*public InputStream readFile(String path){
            File file = new File(path);
            InputStream in = null;
            try{
                in = new InputStreamReader();
            }
        }*//*
    static class ServiceResponse{
        int code;
        String request = "";
        String response = "";
    }

    public void executeFile(){
        List<String> rows = new ArrayList<String>();
        List<Future<ServiceResponse>> tasks = new ArrayList<Future<ServiceResponse>>();
        for(final String row : rows){
            Callable<ServiceResponse> callable = new Callable<ServiceResponse>() {
                @Override
                public ServiceResponse call() throws Exception {
                    HttpConnection con = new HttpConnection();
                    String url  = serviceURL+"?id="+row;
                    HttpGet get = new HttpGet(url);
                    HttpResponse response = con.execute(get);
                    ServiceResponse s = new ServiceResponse();
                    s.code = resposne.getResposneCode();
                    s.request = row;
                    if(resposne.getResposneCode()==200){
                        s.response =  response.getEntity().toString();
                    }else{
                        s.response ="error";
                    }
                    return s;
                }
            };
            tasks.add(service.submit(callable));
        }
        List<String> resultRows =  new ArrayList<String>();
        List<Future<ServiceResponse>> pending = new ArrayList<Future<ServiceResponse>>();
        for(Future<ServiceResponse> task :  tasks){
            try{
                if(task.isDone()){
                    ServiceResponse res  = task.get();
                    if(res.code == 200){
                        resultRows.add(res.request+res.response);
                    }
                }else{
                    pending.add(task);
                }
            }catch (ExecutionException e){
                e.printStackTrace();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        writeFile(resultRows);
    }

    public List<String> execute(List<Future<ServiceResponse>> tasks, ){
        List<String> resultRows =  new ArrayList<String>();
        for(Future<ServiceResponse> task :  tasks){
            try{
                if(task.isDone()){
                    ServiceResponse res  = task.get();
                    if(res.code == 200){
                        resultRows.add(res.request+res.response);
                    }
                }else{
                    pending.add(task);
                }
            }catch (ExecutionException e){
                e.printStackTrace();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void writeFile(List<String> results){

    }*/


    public static void main(String args[]){
        int i=0;
        for(i=0;i<= Integer.MAX_VALUE;i++){

        }
        System.out.println(i);
        //System.out.println(Math.pow(2,32)-1);
    }

}
