package com.odcgroup.example.process;



import java.util.Map;

import com.odcgroup.uif.pageflow.engine.PageflowContext;
import com.odcgroup.uif.pageflow.engine.action.ActionResult;
import com.odcgroup.uif.pageflow.engine.exception.ActionFailedException;
import com.odcgroup.uif.validation.reporter.ReportItem;
import com.odcgroup.wui.pageflow.AbstractExecutionPageflowAction;
// TODO This class in present in custo-lib template. Read the README.txt for further information.
//import com.odcgroup.test.HelloWorldBean;
//import com.odcgroup.uif.context.model.InvalidScopeKeyException;

/**
 * Pageflow process class.
 * The overriden method executeProcess does the following action:
 * - Instanciate an HelloWorldBean object (defined in the project psp-logo-custo-lib)
 * - Set the message property of the bean.
 * - Save the bean in the scope.
 * The goal is to get this bean from the scope in the pageflow page HelloWorldStatePage.
 */
public class HelloWorldProcess extends AbstractExecutionPageflowAction {


	public static final String TEST_MESSAGE_KEY = "testMessage";
	
	/* (non-Javadoc)
	 * @see com.odcgroup.uif.workflow.process.Process#executeProcess(com.odcgroup.uif.context.model.Scope, com.odcgroup.uif.workflow.HTTPParameters, com.odcgroup.uif.workflow.Workflow)
	 */
	@Override
	public ActionResult execute(PageflowContext<ReportItem> context, Map<String, Object> objectModel,
			Map<String, Object> parameters) throws ActionFailedException {
		
// The HelloWorldBean class in present in custo-lib template. Read the README.txt for further information.
//
//		// Instanciate a message bean from the custom library psp-logo-custo-lib
//		HelloWorldBean messageBean = new HelloWorldBean();
//		
//		// Set the message of the bean
//		messageBean.setMessage("HelloWorldBean: HelloWorld from the pageflow process HelloWorldProcess");
//		
//		try {
//			scope.set(TEST_MESSAGE_KEY, messageBean);
//		}
//		catch (InvalidScopeKeyException iske)
//		{
//			// Something went wrong with the scope.
//			return new ProcessResult(0);
//		}
		
		return new ActionResult();
	}

}
