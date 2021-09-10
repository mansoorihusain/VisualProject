import java.util.*;
class firstNameUpperCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        StringBuffer sb = new StringBuffer(st.length());
		String a[] = st.split(" ");
		for (int i=0;i<a.length;i++) {
			sb.append(Character.toUpperCase(a[i].charAt(0))).append(a[i].substring(1)).append(" ");
			
		}
		System.out.print(sb);

        
    }
}