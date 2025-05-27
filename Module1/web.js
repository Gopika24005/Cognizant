<select id="categoryFilter">
  <option value="Music">Music</option>
  <option value="Tech">Tech</option>
  <option value="Art">Art</option>
</select>

<input type="text" id="searchInput" placeholder="Search Events by Name">
<div id="loader" style="display:none;">Loading...</div>
<div id="eventsContainer"></div>

<form id="registrationForm">
  <input name="name" placeholder="Your Name">
  <input name="email" placeholder="Your Email">
  <select name="event">
    <option value="Music Fest">Music Fest</option>
    <option value="Tech Talk">Tech Talk</option>
  </select>
  <button type="submit" id="registerBtn">Register</button>
</form>
