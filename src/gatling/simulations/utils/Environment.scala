package utils

import java.time.LocalDate
import java.time.format.DateTimeFormatter

object Environment {

 val environment: String = System.getProperty("env")
 val idamURL = "https://idam-web-public.perftest.platform.hmcts.net"
// val baseURL = "http://hmc-cft-hearing-service-aat.service.core-compute-aat.internal"
 val baseURL = "http://hmc-cft-hearing-service-perftest.service.core-compute-perftest.internal"

 val IDAM_API_BASE_URI = "https://idam-api.perftest.platform.hmcts.net"

 val OAUTH_CLIENT = "xuiwebapp" //am_role_assignment // xuiwebapp / paybubble
// val S2S_BASE_URI = "http://rpe-service-auth-provider-aat.service.core-compute-aat.internal/testing-support"
 val S2S_BASE_URI = "http://rpe-service-auth-provider-perftest.service.core-compute-perftest.internal/testing-support"
 val S2S_SERVICE_NAME = "hmc_hmi_inbound_adapter"
 //val S2S_SERVICE_NAME = "am_role_assignment_service"
 //val S2S_SERVICE_NAME = "aac_manage_case_assignment"
  //val S2S_SERVICE_NAME = "aac_manage_case_assignment"
  val S2S_SERVICE_NAME2 = "api_gw"
 val IDAM_OAUTH_SECRET = "{123456}" //to be obtained from vault
 //val IDAM_OAUTH_SECRET = "JBS3NSGNKOQQ22G7"
 val FUNCTIONAL_TEST_CLIENT_S2S_TOKEN = ""

 val minThinkTime = 2
 val maxThinkTime = 5

 val commonHeader = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "Connection" -> "keep-alive",
  "ServiceAuthorization" -> "${s2sToken}",
  //"Authorization" -> "${accessToken}")
  "Authorization" -> "Bearer eyJ0eXAiOiJKV1QiLCJraWQiOiI4cDJpajg2S0pTeENKeGcveUovV2w3TjcxMXM9IiwiYWxnIjoiUlMyNTYifQ.eyJzdWIiOiJzc2NzSGVhcmluZ19tYW5hZ2VyNTAxQGp1c3RpY2UuZ292LnVrIiwiY3RzIjoiT0FVVEgyX1NUQVRFTEVTU19HUkFOVCIsImF1dGhfbGV2ZWwiOjAsImF1ZGl0VHJhY2tpbmdJZCI6ImIwYjg2ODMyLTk4YTItNDllMC1iYTZkLWZmYjUxYzY4ZjRmOS0yMjQzNzA2NzEiLCJzdWJuYW1lIjoic3Njc0hlYXJpbmdfbWFuYWdlcjUwMUBqdXN0aWNlLmdvdi51ayIsImlzcyI6Imh0dHBzOi8vZm9yZ2Vyb2NrLWFtLnNlcnZpY2UuY29yZS1jb21wdXRlLWlkYW0tcGVyZnRlc3QuaW50ZXJuYWw6ODQ0My9vcGVuYW0vb2F1dGgyL3JlYWxtcy9yb290L3JlYWxtcy9obWN0cyIsInRva2VuTmFtZSI6ImFjY2Vzc190b2tlbiIsInRva2VuX3R5cGUiOiJCZWFyZXIiLCJhdXRoR3JhbnRJZCI6IjZwTDZUMGpwOTdNSG8xbzczMGJWLWhHVnlYOCIsIm5vbmNlIjoiVHdLUlVDdVhyUnRXdjQxRHloS29fTHYzRWRnT1o3Nk83Uzc5dmMtUk44USIsImF1ZCI6Inh1aXdlYmFwcCIsIm5iZiI6MTcwNzE2Mzk2NywiZ3JhbnRfdHlwZSI6ImF1dGhvcml6YXRpb25fY29kZSIsInNjb3BlIjpbIm9wZW5pZCIsInByb2ZpbGUiLCJyb2xlcyIsImNyZWF0ZS11c2VyIiwibWFuYWdlLXVzZXIiLCJzZWFyY2gtdXNlciJdLCJhdXRoX3RpbWUiOjE3MDcxNjM5NjYsInJlYWxtIjoiL2htY3RzIiwiZXhwIjoxNzA3MTkyNzY3LCJpYXQiOjE3MDcxNjM5NjcsImV4cGlyZXNfaW4iOjI4ODAwLCJqdGkiOiJabWlYbmFfQnZ2OFVoZFBUOTdQV1RZVTVrdTAifQ.E0bYnew24j3SdtHbGO6KGFJRWxGsL7I9H1s1TL8DmD_ZS_6upaAn8r6CxhnkIOs2Lq4RVjdydOh21oHiAk7a-QZTYbeulwVGrdL3-KNhZ2e5TTiZgbq1BaEm0aP7KiV4FFoFAgeMUnNVkit105Iu1Pxw8W4jTMBxNJ5Yi48r5Zvp8AEAj9hEdN7XxGzX6GoLI153IkZrVqFtF8E05GtTGARC9ueBvAt6zqpMVt0IzRe_foKZ5qtnMk5EXo77dqMpZXprfczqIpmMzPxqn2VFHN2fDD7JxwLwiiqA-8L0el1_geut1V9dZHqFjQ7ww8AOOFSEKNImPBh2uLEA7iSkbQ")



 val inboundcommonHeader = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "Connection" -> "keep-alive",
  "ServiceAuthorization" -> "${s2sToken}",
  "Authorization" -> "Bearer eyJ0eXAiOiJKV1QiLCJraWQiOiI4cDJpajg2S0pTeENKeGcveUovV2w3TjcxMXM9IiwiYWxnIjoiUlMyNTYifQ.eyJzdWIiOiJzc2NzSGVhcmluZ19tYW5hZ2VyNDAxQGp1c3RpY2UuZ292LnVrIiwiY3RzIjoiT0FVVEgyX1NUQVRFTEVTU19HUkFOVCIsImF1dGhfbGV2ZWwiOjAsImF1ZGl0VHJhY2tpbmdJZCI6IjUzNDA1NTNlLTc1ODktNGY0MC1iMmI4LTM3YjQ1OTIzNDFkYS0xMzEwMTEyIiwiaXNzIjoiaHR0cHM6Ly9mb3JnZXJvY2stYW0uc2VydmljZS5jb3JlLWNvbXB1dGUtaWRhbS1wZXJmdGVzdC5pbnRlcm5hbDo4NDQzL29wZW5hbS9vYXV0aDIvcmVhbG1zL3Jvb3QvcmVhbG1zL2htY3RzIiwidG9rZW5OYW1lIjoiYWNjZXNzX3Rva2VuIiwidG9rZW5fdHlwZSI6IkJlYXJlciIsImF1dGhHcmFudElkIjoiQlZmU1liQjZyUHYydnhQNHJRRkhfVXRxSk5jIiwibm9uY2UiOiJxWGxCdERLam5UUERXSWpMR3ZrZzRzWGJzQUtFZmE5VVFtaVVTRGFfbzVvIiwiYXVkIjoieHVpd2ViYXBwIiwibmJmIjoxNjYxNDE2NjgxLCJncmFudF90eXBlIjoiYXV0aG9yaXphdGlvbl9jb2RlIiwic2NvcGUiOlsib3BlbmlkIiwicHJvZmlsZSIsInJvbGVzIiwiY3JlYXRlLXVzZXIiLCJtYW5hZ2UtdXNlciIsInNlYXJjaC11c2VyIl0sImF1dGhfdGltZSI6MTY2MTQxNjY3OSwicmVhbG0iOiIvaG1jdHMiLCJleHAiOjE2NjE0NDU0ODEsImlhdCI6MTY2MTQxNjY4MSwiZXhwaXJlc19pbiI6Mjg4MDAsImp0aSI6IlZabGo2enplR0p6NzVGa2lLaXgwMDhNeHJIbyJ9.HtLZdIeiFZdIRI2gZfGp_VOO7JrD7d9fWH64jdXzdd3LK3_grT0qV2KxaxhfOk6i0B3ll11iQne_KJBauJRZ2GrUDoVAqk7su6OobHa78aQdzbutvHnphxQpUMSIXcX6id-e9oONVv87cVDaX-aVNs5ItBFG8rIP95IiubSJPPe0suLfDs6lbvKCk0_V6m0n4_bB2CA_hcZ8qooYxNDcuza5URS-K-8QAuQ05fvdX8EOJZHXbHKSukOCpCWmv4amI10zdSpNlSXG1A3amOvfkcWahjPG9T_rs_wibsp7YxMvcoAcKyBOvbZD20rNnBEBs3svshG59UVDepj_fjnQhw")

val basicHeader = Map(
  "accept" -> "*/*",
  "accept-encoding" -> "gzip, deflate, br",
  "Connection" -> "keep-alive")



 val pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd")
 val current_date = LocalDate.now().format(pattern)

}


