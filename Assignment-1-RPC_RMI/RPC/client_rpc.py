import xmlrpc.client

SERVER_IP = "4.240.102.214"

try:
    proxy = xmlrpc.client.ServerProxy(f"http://{SERVER_IP}:8000/RPC2")

    print("Add:", proxy.add(10, 5))
    print("Subtract:", proxy.subtract(10, 5))
    print("Multiply:", proxy.multiply(10, 5))
    print("Divide:", proxy.divide(10, 5))

except Exception as e:
    print("RPC Error:", e)
