class Trie 
{
	Node root;
	Trie(){
		root=new Node();
	}

	static class Node{
		Node[]children;
		boolean eow;

		Node(){
			children=new Node[26];
			eow=false;
		}
	}

	void insert(String word){
		Node curr=root;
		for(int i=0;i<word.length();i++){
			int indx=word.charAt(i)-'a';

			if(curr.children[indx]==null){
				curr.children[indx]=new Node();
			}
			if(i==word.length()-1){
				curr.children[indx].eow=true;
			}

			curr=curr.children[indx];
		}
	}

	String search(String word){
		Node curr=root;
		for(int i=0;i<word.length();i++){
			int indx=word.charAt(i)-'a';

			if(curr.children[indx]==null){
				return "Not found";
			}
			if(i==word.length()-1 && curr.children[indx].eow==false){
				return "Not Found";
			}
			curr=curr.children[indx];
		}
		return "Found "+word;
	}

	String startWith(String str){
		Node curr=root;
		for(int i=0;i<str.length();i++){
			int indx=str.charAt(i)-'a';
			if(curr.children[indx]==null){
				return "Not Found "+str;
			}
			curr=curr.children[indx];
		}
		return "Found "+str;
	}

	public static void main(String[] args) 
	{
		Trie t = new Trie();

        t.insert("apple");
        t.insert("app");
		System.out.println("Words inserted successfully!");
		System.out.println(t.search("apple"));
		System.out.println(t.startWith("acp"));
        
	}
}

