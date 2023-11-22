
public class largest_rectangle {

	public static int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int fc=0,bc=0;
        int f=0,b=0;
        int res=0;
     for(int i=0;i<n;i++){
         if(i==0){
             f=i+1;
             while(f<n){
                 if(heights[f]>=heights[i]){
                     fc+=1;
                     f+=1;
                 }
                 else{
                     break;
                 }
          
             }
             res=Math.max(res,((fc+1)*heights[i]));
             fc=0;
         }
         else if(i==n-1){
             b=i-1;
             while(b>=0){
                 if(heights[b]>=heights[i]){
                     bc+=1;
                 }
                 else{
                     break;
                 }
                 b-=1;
             }
             res=Math.max(res,((bc+1)*heights[i]));
             bc=0;
         }
         else{
             f=i+1;
              while(f<n){
                 if(heights[f]>=heights[i]){
                     fc+=1;
                 }
                 else{
                     break;
                 }
                 f+=1;
             }
             b=i-1;
             while(b>=0){
                 if(heights[b]>=heights[i]){
                     bc+=1;
                 }
                 else{
                     break;
                 }
                 b-=1;
             }
             res=Math.max(res,(((fc+1)*heights[i])+((bc)*heights[i])));
             fc=bc=0;
         }
     }  
      return res; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar= {2,4};
		System.out.println(largestRectangleArea(ar));
	}

}
