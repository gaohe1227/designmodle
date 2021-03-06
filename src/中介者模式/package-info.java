/**
 * Description:用一个中介者对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，
 *            从而使耦合松散，而且可以独立地改变它们之间的交互
 *            
 * 应用实例： 1、中国加入 WTO 之前是各个国家相互贸易，结构复杂，现在是各个国家通过 WTO 来互相贸易。
 *        2、机场调度系统。 3、MVC 框架，其中C（控制器）就是 M（模型）和 V（视图）的中介者。
 * 优点： 1、降低了类的复杂度，将一对多转化成了一对一。 2、各个类之间的解耦。 3、符合迪米特原则。
 * 缺点：中介者会庞大，变得复杂难以维护。
 * 使用场景： 1、系统中对象之间存在比较复杂的引用关系，导致它们之间的依赖关系结构混乱而且难以复用该对象。
 *        2、想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类。
 * 注意事项：不应当在职责混乱的时候使用。
 * 重点在中介类，解耦和
 * @author:高鹤
 * @date:2017年7月10日
 */
package 中介者模式;