package H_Hashing;

public class c_implementation_of_open_Addressing {
	int arr[];
	int cap, size;
	public c_implementation_of_open_Addressing(int c) {
		cap = c;
		size =0;
		arr = new int[cap];
		for(int i = 0; i<cap; i++)
			arr[i] = -1;
	}
	int Hash(int key) {
	return key % cap;
	}
	boolean insert(int key) {
		if(cap == size) return false;
		int i = Hash(key);
		while(arr[i] != -1 && arr[i] != -2 && arr[i] != key) {
			i = (i+1)%cap;
			}
		if(arr[i]==key)
			return false;
		else
			arr[i] = key;
		  size++;
		  return true;
	}
	boolean search(int key) {
		int h = Hash(key);
		int i = h;
		while(arr[i] != -1) {
			if(arr[i] == key)
				return true;
			i = (i+1)%cap;
			if(i==h) return false;
		}
		return true;
	}
	boolean erase(int key) {
		int h = Hash(key);
		int i = h;
		while(arr[i]!=-1) {
			if(arr[i]==key) {
				arr[i] = -2;
				return true;
			}
			i= (i+1)%cap;
			if(i==h) return false;
		}
		return false;
	}
}

class jk{
	public static void main(String[] args) {
		c_implementation_of_open_Addressing mh = new c_implementation_of_open_Addressing(7);
		mh.insert(49);
		mh.insert(56);
		mh.insert(72);
		if(mh.search(56)==true)
			System.out.println("YES");
		else
			System.out.println("NO");
		mh.erase(56);
		if(mh.search(56)==true)
			System.out.println("YES");
		else
			System.out.println("NO");	
	}
}

