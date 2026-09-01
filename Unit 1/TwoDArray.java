class TwoDArray{
    public void main(String[]args){
        int [][] a= {{1,2},{3,4}};
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }

        for(int[] inner: a){
            for(int item:inner)
                System.out.print(item+"\t");
            System.out.println();
        }
    }
}