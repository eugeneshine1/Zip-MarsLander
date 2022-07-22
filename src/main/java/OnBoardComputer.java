public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;
//        while (true) {
//            if (status.Altitude>10000) {
//                burn = 100;
//            }  else if (status.Altitude<10000 && status.Altitude>4000) {
//                burn =200;
//            } else if (status.Altitude<4000 && status.Altitude>1000) {
//                burn = 200;
//            } else if (status.Altitude<1000 && status.Altitude>500) {
//                burn = 200;
//            } else if (status.Altitude<500 && status.Altitude>100) {
//                burn = 100;
//            }


        System.out.println(burn); /*hack!*/
        return burn;
    }
//}

}
