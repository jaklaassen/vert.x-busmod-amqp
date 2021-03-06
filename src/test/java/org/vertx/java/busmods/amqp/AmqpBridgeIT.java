package org.vertx.java.busmods.amqp;

import org.vertx.java.testframework.TestBase;

public class AmqpBridgeIT extends TestBase implements AmqpBridgeTests {
    // {{{ setUp
    /** {@inheritDoc} */
    @Override
    protected void setUp() throws Exception {
        super.setUp();

        startApp(true, AmqpBridgeTestClient.class.getName());
    }
    // }}}

    public void testFoo() { startTest(getMethodName()); }
    public void testInvokeRpcWithSingleReply() { startTest(getMethodName()); }
    public void testInvokeRpcWithMultipleReplies() { startTest(getMethodName()); }
    public void testSendBsonToAMQP() { startTest(getMethodName()); }
}
