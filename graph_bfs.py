""""
Breadth First Search (BFS) implementation for a graph using adjacency list representation.
forr connected graphs 
"""

# def add_edge(adj, i, j):
#     adj[i].append(j)   # add edge from i to j

# def display_graph(adj):
#     for i in range(len(adj)):
#         lis = []
#         for j in adj[i]:       
#             lis.append(j)
#         print(f"{i} -> {lis}")

# def bfs(adj,v):
#     res = []
#     start = 0
#     visites = [False]*v
#     visites[start] = True
#     from collections import deque
#     que = deque()
#     que.append(start)

#     while que:
#         node = que.popleft()
#         res.append(node)
#         for i in adj[node]:
#             if not visites[i]:
#                 visites[i] = True
#                 que.append(i)
#     print(res)
    

# if __name__ == "__main__":
#     v = 5
#     adj = [[] for _ in range(v)]  # create adjacency list for 5 vertices

#     add_edge(adj, 0, 1)
#     add_edge(adj, 0, 2)
#     add_edge(adj, 1, 0)
#     add_edge(adj, 1, 2)
#     add_edge(adj, 1, 3)
#     add_edge(adj, 2, 0)
#     add_edge(adj, 2, 1)
#     add_edge(adj, 3, 1)
#     add_edge(adj, 3, 4)
#     add_edge(adj, 4, 2)
#     add_edge(adj, 4, 3)

#     print("Graph adjacency list:")
#     display_graph(adj)

#     print("BFS traversal starting from vertex 0:")
#     bfs(adj,v)


# BFS from given source s
from collections import deque

def bfsOfGraph(adj, s, visited, res):
    
    # Create a queue for BFS
    q = deque()
    
    # Mark source node as visited and enqueue it
    visited[s] = True
    q.append(s)
    
    # Iterate over the queue
    while q:
        
        # Dequeue a vertex and store it
        curr = q.popleft()
        res.append(curr)
        
        # Get all adjacent vertices of the dequeued 
        # vertex curr If an adjacent has not been 
        # visited, mark it visited and enqueue it
        for x in adj[curr]:
            if not visited[x]:
                visited[x] = True
                q.append(x)
    return res

# Perform BFS for the entire graph which maybe
# disconnected
def bfsDisconnected(adj):
    V = len(adj)
    
    # create an array to store the traversal
    res = []
    
    # Initially mark all the vertices as not visited
    visited = [False] * V
    
    # perform BFS for each node
    for i in range(V):
        if not visited[i]:
            bfsOfGraph(adj, i, visited, res)
    return res

if __name__ == "__main__":
    adj = [[1, 2], [0], [0],
        [4], [3, 5], [4]]
    ans = bfsDisconnected(adj)
    for i in ans:
        print(i, end=" ")