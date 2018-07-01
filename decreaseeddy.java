public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int arr[] = new int[]{11,4,3,1,4,7,8,12,2,3,7};
        int countarr[] = new int[10];
        int pos=0,count=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(i==arr.length-1)
            {
                break;
            }
            if(arr[i]>arr[i+1])
            {
                count++;
            }
            else
            {
                if(count!=0){
                    
               countarr[pos] = count+1;
                    pos++;
                System.out.println(count+1);
                }
                count = 0;
               
            }
        }
        int maxval=0;
        for(int i=0;i<pos;i++)
        {
            if(countarr[i]>maxval)
            {
                maxval = countarr[i];
            }
        }
        System.out.println("The Max Length is : "+maxval);
        System.out.println("The Count is : "+pos);
        
        
        
    }


	}
