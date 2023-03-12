function addNewEvent() {
  const addEventForm = document.getElementById("newEventForm").elements;
  const name = addEventForm["title"].value;
  const description = addEventForm["description"].value;
  const start_date = addEventForm["start_date"].value;
  const end_date = (addEventForm["end_date"].value);
  const location = (addEventForm["location"].value);
  const event = {
    name,
    description,
    start_date,
    end_date,
    location
  }
  alert(JSON.stringify(event));
  fetch(`/newevent`, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(event)
  })
    .then(res => res.json())
    .then(handle500Error)
    .then(json => {
      alert(`Successfully added event with id ${json.id}: (${JSON.stringify(json)})`);
    })
    .catch(renderError);
}

function deleteEventById(eventId) {
  fetch(`/deleteevent/${eventId}`, {
    method: "DELETE"
  })
    .then(res => res.json())
    .then(handle500Error)
    .then(json => {
      alert(`Deleted event ${json.id} from the database (${JSON.stringify(json)}).`);
    })
    .catch(renderError);
}
