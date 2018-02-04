class Deque<T> {
    private var head: Element<T>? = null

    fun push(value: T) {
        // if head == null, assign this node to head
        if (head == null) {
            head = Element(value)
            return
        } else {
            // Set the pointer to the first node
            var pointer = head
            // While it's pointing at something, keep moving back through the nodes
            while(pointer!!.prev != null) pointer = pointer.prev
            // Create a new element w next = current and change current prev = new Node
            pointer.prev = Element(value, next=pointer)
        }
    }

    fun pop(): T? {
        var pointer = head
        // While there's > 1 node, keep going backwards...
        while(pointer!!.prev != null) pointer = pointer.prev
        // Change prev of new last node to 'remove' old last node
        pointer.next?.prev = null
        return pointer.value
    }

    fun unshift(value: T) {
        if (head == null) {
            head = Element(value)
            return
        }
        // Set current head to point to incoming head
        head!!.next = Element(value, prev=head)
        // Set head to point to the new element
        head = head!!.next
    }

    fun shift(): T? {
        val value = head?.value
        // Change head to point to new front node + set next to null
        head = head!!.prev
        head?.next = null
        return value
    }

    private data class Element<T>(val value: T, var prev: Element<T>? = null, var next: Element<T>? = null)
}