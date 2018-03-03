from twilio.rest import Client

# Your Account SID from twilio.com/console
account_sid = "ACa5f39b9fc8bc00d2df9a4a5dc2a35e81"
# Your Auth Token from twilio.com/console
auth_token  = "41f9bce541049bd9875262ca67df6f8a"

client = Client(account_sid, auth_token)

message = client.messages.create(
    to = "+5516997948298",
    from_ = "2393092192",
    body = " My Name Is Jeff !")

print(message.sid)
