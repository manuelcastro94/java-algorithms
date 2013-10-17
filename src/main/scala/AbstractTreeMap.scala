

import java.util
import java.util.LinkedList
import scala.util.control.Breaks._

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 10/10/13
 * Time: 15:02
 * To change this template use File | Settings | File Templates.
 */
trait AbstractTreeMap[K,V] extends MyMap[K,V]{

  case class Node(key:K, var value:V,var left:Node=null, var right:Node = null){
    override def toString():String = s"{k:$key, v:$value,l:$left, r:$right}"
    def size(node:Node):Int = 1 + size(head.left) + size(head.right)
    def isRoot(node:Node) = if (node.right == null && node.left ==null) true

  }

  def doNth(idx:Int,node:Node):Node = {
    val ls:Int = doSize(node.left)
    if(idx == ls) node
    else if(idx>ls) doNth(idx-ls-1,node.right)
    else if(idx<ls) doNth(idx,node.left)
    else null
  }

  def nth(idx:Int):Node = doNth(idx,head)

  def range(from:Int, last:Int) : util.LinkedList[Node] = {
    var list:util.LinkedList[Node] = new util.LinkedList[Node]

    for(i<-from to last) {
      var node:Node = nth(i)
      list.add(node)

    }
    println(list size)
    list
  }

  protected var head:Node = null

  def contains(k:K): Boolean = find(head, k) == null
  def get(k:K):V = {
    val n = find(head,k)
    if(n==null) notfound(k)
    n.value
  }
  def size(): Int = doSize(head)
  def doSize(node:Node):Int = if(node == null) 0 else {1 +doSize(node.left) + doSize(node.right)}

  def newLeaf(k:K,v:V) = { Node(k,v)}
  def put(k:K,v:V) = head = doPut(head, k, v)
  def remove(k:K) = head = doRemove(head  , k)

  def find(n:Node,k:K):Node
  def doPut(n:Node,k:K,v:V):Node
  def doRemove(n:Node, k:K):Node
  def firstNode(n:Node):Node = if (n == null || n.left == null) n else firstNode(n.left)
  override def toString:String = if(head == null) "Empty" else head.toString


}
