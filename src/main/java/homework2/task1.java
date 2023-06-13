package homework2;
//1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
//        Запрос вида select * from students where name = 'Ivanov' and country = 'Russia' and city = 'Moscow'
//        Если значение null, то параметр не должен попадать в запрос.
//        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class task1 {
    public static void main(String[] args) {
    String sourceData = "name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null";

    String [] splitData = sourceData.replace("\"", "").split(",");

    StringBuilder sb = new StringBuilder();

    for (String fname : splitData) {
        String [] tempString = fname.split(":");

        if (!(tempString[1].equals("null"))) {
            sb.append(tempString[0]).append(" = ").append("'").append(tempString[1]).append("'").append(" and ");
        }
    }
    if (sb.length() > 0){
        sb.delete(sb.length()-5, sb.length()-1);                                //удаление последнего and
    }
    System.out.println(sb);


    }
}
