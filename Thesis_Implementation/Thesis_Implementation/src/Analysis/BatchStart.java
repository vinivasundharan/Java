package Analysis;

import java.io.IOException;

public class BatchStart 
{
	Runtime btch; 
	Process proc; 
	String btchtrendcheck ="E:\\KNIME\\knime.exe -application org.knime.product.KNIME_BATCH_APPLICATION -consoleLog -reset -workflowFile=\"C:\\Users\\Jana\\Desktop\\KNIMETrend.zip\"";
	//String btchtrendcheck="E:\\KNIME\\knime.exe -application org.knime.product.KNIME_BATCH_APPLICATION -consoleLog -noexit -reset -workflowDir=\"C:\\Users\\Jana\\knime-workspace\\test\"";
	String trendtest = "E:\\KNIME\\knime.exe -application org.knime.product.KNIME_APPLICATION";
	
	public BatchStart(){}
	
	public void runKnime()
	{		
		try {
			btch = Runtime.getRuntime();
			proc = btch.exec(trendtest);
		    } 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void runBatch()
	{
		
		try {
			btch = Runtime.getRuntime();
			proc = btch.exec(btchtrendcheck);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
