package system12306;

public class Ticket {
    //没有任何逻辑，包含一些基本属性，小容器
    //一个对象包含很多属性，增强可读性

    private String start;//起点站
    private String end;//终点站
    private Float price;//价格

    public Ticket() {
    }

    public Ticket(String start, String end, Float price) {
        this.start = start;
        this.end = end;
        this.price = price;
    }

    //为了让打印时方便，重写tostring
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        builder.append(this.start);
        builder.append("-->");
        builder.append(this.end);
        builder.append(",");
        builder.append("价格为：");
        builder.append(this.price);
        builder.append("]");
        return builder.toString();
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
