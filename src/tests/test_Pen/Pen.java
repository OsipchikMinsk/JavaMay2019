package tests.test_Pen;

class Pen {
    private  int price;
    private String producerName;

    public Pen(int price, String producerName) {
        this.price = price;
        this.producerName = producerName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (null == obj){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Pen pen = (Pen) obj;
        if (price !=pen.price){
            return false;
        }
        if (null == producerName){
            return (producerName == pen.producerName);
        } else {
            if (producerName!=pen.producerName){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {

        return (int) (31*price + ((null ==producerName) ? 0:producerName.length()*7));
    }

    @Override
    public String toString() {
        return getClass().getName() + "@"+
                "price=" + price +
                ", producerName='" + producerName + '\'' +
                '}';
    }

    public static void main(String[] args) throws InterruptedException {
       while (true){
           System.out.print("Hюся я тебя люблю!");
           Thread.sleep(500);
       }

    }
}