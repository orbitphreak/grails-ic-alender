class TestController {

  def index = {

    render(contentType: 'text/calendar') {
      calendar {
        events {
          event(start: Date.parse('dd.MM.yyyy HH:mm', '31.10.2009 14:00'), end: Date.parse('dd.MM.yyyy HH:mm', '31.10.2009 15:00'), description: 'Events description', summary: 'Short info1') {
            organizer(name: 'Silvio Wangler', email: 'silvio.wangler@gmail.com')
          }
          event(start: Date.parse('dd.MM.yyyy HH:mm', '01.11.2009 14:00'), end: Date.parse('dd.MM.yyyy HH:mm', '01.11.2009 15:00'), description: 'hell yes', summary: 'Short info2', location: '@home', classification: 'private')
        }
      }
    }
  }
}