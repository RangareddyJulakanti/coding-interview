package com.ranga.eample;

public class TargetSum {
    public static void main(String a[]){

        int arr[]={2,3,5,1,4};
        int target=7;
        targetSum(arr,target);
    }

    private static void targetSum(int[] arr,int target) {
        int length=arr.length;

        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(arr[i]+arr[j]==target){
                    int first=i+1;
                    int second=j+1;
                  System.out.println(first+""+second);
                }
            }
        }

    }
}
