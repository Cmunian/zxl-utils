package utils;

public class AttributeToColumn {

	/**
	 * @param attr
	 * 将实体属性转换为表字段
	 */
	public static String getColumn(String attr){
		char a[] = attr.toCharArray();
		StringBuffer s1 = new StringBuffer();
 		String column = "";
		if(attr.length()==0){
			return "";
		}else{
			for(int i = 0;i<a.length;i++){
				if(a[i] >= 'A' && a[i] <= 'Z'){
					s1.append('_').append(a[i]);
				}else{
					s1.append(a[i]);
				}
			}
		}
		column = s1.toString().toLowerCase();
		return column;
	}

}
