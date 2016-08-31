/** 
 * author: christ 
 * data：2016年7月15日 下午3:46:15 
 * 加油站问题
 */
public class Gas_station {
	public int canComleteCircuit(int[] gas, int[] cost){
		for(int i = 0; i < gas.length; i++){
			int j = i;
			int now = 0;
			if(gas[j] < cost[j]){
				continue;
			}
			Integer.
			now = gas[j]-cost[j];
			j = (i+1)%gas.length;
			while(j != i){
				if(gas[j]+now<cost[j]){
					break;
				}else{
					now = now+gas[j]-cost[j];
					j = (j+1)%gas.length;
				}
			}
			if(j == i){
				return i;
			}else{
				continue;
			}
		}
		return -1;
	}
}
