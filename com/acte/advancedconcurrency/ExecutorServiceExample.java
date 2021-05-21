package com.acte.advancedconcurrency;


import java.util.concurrent.*;

import java.util.*;

public class ExecutorServiceExample {  
	  
    public static void main(String[] args) throws InterruptedException, ExecutionException {  
        ExecutorService executorService = Executors.newSingleThreadExecutor();  
        
        Set<Callable<String>> callables = new HashSet<Callable<String>>();  
  
        callables.add(new Callable<String>() {  
            public String call() throws Exception {  
                return "Task 1";  
            }  
        });  
        callables.add(new Callable<String>() {  
            public String call() throws Exception {  
                return "Task 2";  
            }  
        });  
        callables.add(new Callable<String>() {  
            public String call() throws Exception {  
                return "Task 3";  
            }  
        });  
      
        java.util.List<Future<String>> futures = executorService.invokeAll(callables);  
  
        for(Future<String> future : futures){  
            System.out.println("future.get = " + future.get());  
        }  
  
        executorService.shutdown();  
  
    }  
}  
