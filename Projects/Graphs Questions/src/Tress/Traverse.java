package Tress;

public ArrayList<ArrayList<Integer>> levelArrayList() {
	ArrayList<ArrayList<Integer>> level=new ArrayList<ArrayList<Integer>>();
	for(int i =1;i<=this.height();i++){
		ArrayList<Integer> l= new ArrayList<Integer>();
		l=traverse(this.root,i);
		l.add(level);
	}
	private ArrayList<Integer> traverse(Node n,int l,ArrayList<Integer>l){
		if(n==null){
			return l;
		}
		else if(l==1){
			l.add(n.data);
			return l;
		}
		else{
			ArrayList
		}
	}
	
}